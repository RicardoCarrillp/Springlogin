<%-- 
    Document   : editar
    Created on : 12/02/2020, 05:36:42 PM
    Author     : DESARROLLADOR
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

        <title>Editar Registros</title>
    </head>
    <body>
      
        <div class="container mt-5 col-lg-5">
            
           
        <div class="card-body" >  
                    <form method="POST" class="container mt-4 table table-dark">
                      
                        <label>Marca</label>
                        <input type="text" name="marca" class="form-control" value="${lista[0].Marca}">
                         
                             <label>Modelo</label>
                        <input type="text" name="modelo" class="form-control" value="${lista[0].Modelo}">
                         
                          <label>Color</label>
                          <input type="text" name="color" class="form-control" value="${lista[0].Color}">
                           <label>Placa</label>
                        <input type="text" name="placa" class="form-control" value="${lista[0].Placa}"><br>
                        <input type="submit" value="Editar" class="btn btn-info"><br><br>
                        <a href="index.htm" class="btn btn-danger">Volver</a>
                    </form>
                   
                  </div>
    </body>
</html>
