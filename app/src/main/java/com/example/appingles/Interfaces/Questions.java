package com.example.appingles.Interfaces;

import com.example.appingles.Modelos.BodyQuestion;
import com.example.appingles.Modelos.Question;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface Questions {

    //@POST("api/questions/levels_test_difficulty")
   // Call <List<Question>> getQuestions();
    /*public Call<Question> find(@Field("tb_pregunta_tipo_prueba_codigo_fk") Integer tb_pregunta_tipo_prueba_codigo_fk,
                               @Field("tb_pregunta_dificultad_codigo_fk") Integer tb_pregunta_dificultad_codigo_fk,
                               @Field("tb_pregunta_nivel_codigo_fk") Integer tb_pregunta_nivel_codigo_fk);
*/
    @GET("api/questions/")
    Call <Question> getQuestion();


    @POST("api/questions/")
    Call<Question> createQuestion(@Body BodyQuestion bodyQuestion );
      /*@Field("preg_question") String preg_question,
      @Field("preg_opcion_uno") String preg_opcion_uno,
      @Field("preg_opcion_dos") String preg_opcion_dos,
      @Field("preg_opcion_tres") String preg_opcion_tres,
      @Field("preg_opcion_cuatro") String preg_opcion_cuatro,
      @Field("preg_respuesta_correcta") String preg_respuesta_correcta,
      @Field("tb_pregunta_tipo_prueba_codigo_fk") Integer tb_pregunta_tipo_prueba_codigo_fk,
      @Field("tb_pregunta_dificultad_codigo_fk") Integer tb_pregunta_dificultad_codigo_fk,
      @Field("tb_pregunta_nivel_codigo_fk") Integer tb_pregunta_nivel_codigo_fk
*/




}
