package com.example.appingles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.appingles.Interfaces.Questions;
import com.example.appingles.Modelos.BodyQuestion;
import com.example.appingles.Modelos.Question;
import com.example.appingles.Modelos.RetrofitClient;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    EditText edtTipo;
    EditText edtDifi;
    EditText edtNivel;
    EditText edtpregunta;
    EditText edtresp1;
    EditText edtresp2;
    EditText edtresp3;
    EditText edtresp4;
    EditText edtresp_correct;

    /*TextView tvPregunta;
    TextView tvOp1;
    TextView tvOp2;
    TextView tvOp3;
    TextView tvOp4;
    TextView tvOpcorrecta;
    */

    Button btnguardar;
    private Question questions;
    private String url = "http://18.219.62.118:4000";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTipo = findViewById(R.id.edtTipo);
        edtDifi = findViewById(R.id.edtDifi);
        edtNivel = findViewById(R.id.edtNivel);
        edtpregunta = findViewById(R.id.edtpregunta);
        edtresp1 = findViewById(R.id.edtresp1);
        edtresp2 = findViewById(R.id.edtresp2);
        edtresp3 = findViewById(R.id.edtresp3);
        edtresp4 = findViewById(R.id.edtresp4);
        edtresp_correct = findViewById(R.id.edtresp_correct);
        btnguardar = findViewById(R.id.btnguardar);
        //getQuestion();



    }

    public BodyQuestion createQuestion() {
        BodyQuestion newQuestion = new BodyQuestion();
        newQuestion.setPreg_question(edtpregunta.getText().toString().trim());
        newQuestion.setPreg_opcion_uno(edtresp1.getText().toString().trim());
        newQuestion.setPreg_opcion_dos(edtresp2.getText().toString().trim());
        newQuestion.setPreg_opcion_tres(edtresp3.getText().toString().trim());
        newQuestion.setPreg_opcion_cuatro(edtresp4.getText().toString().trim());
        newQuestion.setPreg_respuesta_correcta(edtresp_correct.getText().toString().trim());
        newQuestion.setTb_pregunta_tipo_prueba_codigo_fk(Integer.parseInt(edtTipo.getText().toString().trim()));
        newQuestion.setTb_pregunta_dificultad_codigo_fk(Integer.parseInt(edtDifi.getText().toString().trim()));
        newQuestion.setTb_pregunta_nivel_codigo_fk(Integer.parseInt(edtNivel.getText().toString().trim()));
        return newQuestion;
    }

    public void saveQuestion(BodyQuestion newQuestion ) {
        Call<Question> call = RetrofitClient.
                getInstance()
                .getQuestion()
                .createQuestion(newQuestion);

        call.enqueue(new Callback<Question>() {
            @Override
            public void onResponse(Call<Question> call, Response<Question> response) {

                if(response.isSuccessful()){
                    Toast.makeText(MainActivity.this, response.body().getMessage(), Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<Question> call, Throwable t) {

                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }
 /* private void getQuestion(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Questions questions = retrofit.create(Questions.class);
       // Question body = new Question(3,1,2);

        Call<Question> call = questions.getQuestion();

        call.enqueue(new Callback<Question>() {
            @Override
            public void onResponse(Call<Question> call, Response<Question> response) {
                if(!response.isSuccessful()){
                    Toast.makeText(MainActivity.this, response.code(),  Toast.LENGTH_SHORT).show();
                    return;
                }

                Question questionresponse = response.body();
                BodyQuestion[] arrayquestion = questionresponse.getQuestion();
                tvPregunta.setText(arrayquestion[0].getQuestion());
                tvOp1.setText(arrayquestion[0].getAnswer_1());
                tvOp2.setText(arrayquestion[0].getAnswer_2());
                tvOp3.setText(arrayquestion[0].getAnswer_3());
                tvOp4.setText(arrayquestion[0].getAnswer_4());
                tvOpcorrecta.setText(arrayquestion[0].getCorrect_answer());
                tvPregunta.setText(questionresponse.getPreg_question());
                tvOp1.setText(questionresponse.getPreg_opcion_uno());
                tvOp2.setText(questionresponse.getPreg_opcion_dos());
                tvOp3.setText(questionresponse.getPreg_opcion_tres());
                tvOp4.setText(questionresponse.getPreg_opcion_cuatro());
                tvOpcorrecta.setText(questionresponse.getPreg_respuesta_correcta());

                tvPregunta.setText(questionresponse.getTb_pregunta_dificultad_codigo_fk().toString());
                Toast.makeText(MainActivity.this, "Aqui estoy",  Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onFailure(Call<Question> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(),  Toast.LENGTH_SHORT).show();

            }
        });





    }
*/

    public void save(View view){
        //find(3,1,1);
        //getQuestion();
        saveQuestion(createQuestion());


    }

   /* private void find(Integer tipo, Integer difi, Integer nivel ){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://localhost:4000/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();



        Questions question = retrofit.create(Questions.class);
        Call<Question> call = Questions.find
        call.enqueue(new Callback<Question>() {
            @Override
            public void onResponse(Call<Question> call, Response<Question> response) {

                try {

                    if (response.isSuccessful()){
                        Question q = response.body();


                        tvPregunta.setText(q.preg_question);
                        tvOp1.setText(q.preg_opcion_uno);
                        tvOp2.setText(q.preg_opcion_dos);
                        tvOp3.setText(q.preg_opcion_tres);
                        tvOp4.setText(q.preg_opcion_cuatro);
                        tvOpcorrecta.setText(q.preg_respuesta_correcta);


//                                Toast.makeText(MainActivity.this, "Funciono",  Toast.LENGTH_SHORT).show();




                    }


                }catch (Exception ex){
                    Toast.makeText(MainActivity.this, "Aqui estoy"+ ex.getMessage(),  Toast.LENGTH_SHORT).show();
                }

            }

            @Override
            public void onFailure(Call<Question> call, Throwable t) {
                String text;
                Toast.makeText(MainActivity.this, text = "Error de conexion", Toast.LENGTH_SHORT).show();

            }
        });


    }
*/
}