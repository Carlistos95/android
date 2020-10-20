package com.example.appingles.Modelos;

public class BodyQuestion {


    public Integer id;
    public String preg_question;
    public String preg_opcion_uno;
    public String preg_opcion_dos;
    public String preg_opcion_tres;
    public String preg_opcion_cuatro;
    public String preg_respuesta_correcta;
    public Integer tb_pregunta_tipo_prueba_codigo_fk;
    public Integer tb_pregunta_dificultad_codigo_fk;
    public Integer tb_pregunta_nivel_codigo_fk;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPreg_question() {
        return preg_question;
    }

    public void setPreg_question(String preg_question) {
        this.preg_question = preg_question;
    }

    public String getPreg_opcion_uno() {
        return preg_opcion_uno;
    }

    public void setPreg_opcion_uno(String preg_opcion_uno) {
        this.preg_opcion_uno = preg_opcion_uno;
    }

    public String getPreg_opcion_dos() {
        return preg_opcion_dos;
    }

    public void setPreg_opcion_dos(String preg_opcion_dos) {
        this.preg_opcion_dos = preg_opcion_dos;
    }

    public String getPreg_opcion_tres() {
        return preg_opcion_tres;
    }

    public void setPreg_opcion_tres(String preg_opcion_tres) {
        this.preg_opcion_tres = preg_opcion_tres;
    }

    public String getPreg_opcion_cuatro() {
        return preg_opcion_cuatro;
    }

    public void setPreg_opcion_cuatro(String preg_opcion_cuatro) {
        this.preg_opcion_cuatro = preg_opcion_cuatro;
    }

    public String getPreg_respuesta_correcta() {
        return preg_respuesta_correcta;
    }

    public void setPreg_respuesta_correcta(String preg_respuesta_correcta) {
        this.preg_respuesta_correcta = preg_respuesta_correcta;
    }

    public Integer getTb_pregunta_tipo_prueba_codigo_fk() {
        return tb_pregunta_tipo_prueba_codigo_fk;
    }

    public void setTb_pregunta_tipo_prueba_codigo_fk(Integer tb_pregunta_tipo_prueba_codigo_fk) {
        this.tb_pregunta_tipo_prueba_codigo_fk = tb_pregunta_tipo_prueba_codigo_fk;
    }

    public Integer getTb_pregunta_dificultad_codigo_fk() {
        return tb_pregunta_dificultad_codigo_fk;
    }

    public void setTb_pregunta_dificultad_codigo_fk(Integer tb_pregunta_dificultad_codigo_fk) {
        this.tb_pregunta_dificultad_codigo_fk = tb_pregunta_dificultad_codigo_fk;
    }

    public Integer getTb_pregunta_nivel_codigo_fk() {
        return tb_pregunta_nivel_codigo_fk;
    }

    public void setTb_pregunta_nivel_codigo_fk(Integer tb_pregunta_nivel_codigo_fk) {
        this.tb_pregunta_nivel_codigo_fk = tb_pregunta_nivel_codigo_fk;
    }
}
