<%-- 
    Document   : Agregar
    Created on : 12/02/2020, 03:27:16 PM
    Author     : DESARROLLADOR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Carro</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4" >
            <div class="card border-info">
                <div class="card-header bg-info">
                    
                    <h4>
                        Agregar nuevo registro  </h4>
                    
                    
                </div>
                <div class="card-body">
                    <form method="POST">
                      
                        <label>Marca</label>
                        <input type="text" name="marca" class="form-control">
                          <label>Modelo</label>
                        <input type="text" name="modelo" class="form-control">
                         
                          <label>Color</label>
                          <input type="text" name="color" class="form-control">
                           <label>Placa</label>
                        <input type="text" name="placa" class="form-control"><br>
                        <input type="submit" value="Agregar" class="btn btn-info"><br><br>
                        <a href="index.htm" class="btn btn-danger">Volver</a>
                    </form>
                   
                </div>
            </div>
            
        </div>
    </body>
</html>
