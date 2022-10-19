package com.cursojava.curso.controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojava.curso.model.Almacen;
import com.cursojava.curso.model.Usuario;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @GetMapping(path = "/usuario/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Usuario getUsuario(@PathVariable Long id) {
        try{
            Thread.sleep(5000);
            System.out.println(id);
            Usuario usuario = new Usuario();
            usuario.setId(id);
            usuario.setNombre("Juanita");
            usuario.setApellido("Ramos del Solar");
            usuario.setEmail("alexander_dx_10@hotmail.com");
            usuario.setTelefono("+51966750883");
            usuario.setPassword("123456");
            return usuario;
        }catch(NumberFormatException ex){
            return null;
        } catch (InterruptedException e) {
            return null;
        } 
    }

    @GetMapping(path = "/usuario", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> usuario() {
        try{

            HashMap<String, Object> result = new HashMap<String, Object>();
            result.put("id", "asdasd");
            result.put("data", "#asdasd asdasdasd ");
            result.put("value", 1);
            result.put("state", false);
            // return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(json);
            // return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error de cliente");
            // return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error interno de servidor.");
            // return ResponseEntity.status(HttpStatus.OK).body(new Usuario("tu marido soy"));
            return ResponseEntity.status(HttpStatus.OK).body(result);
        }catch(Exception ex){
            System.out.println(ex);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error interno de servidor.");
        }

    }

    @RequestMapping(value = "/usuarios")
    public List<String> usuarios() {
        return new ArrayList<String>();
    }

}
