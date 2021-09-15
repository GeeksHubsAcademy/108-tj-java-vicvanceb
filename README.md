<p align="center">
    <img src="https://github.com/GeeksHubsAcademy/2020-geekshubs-media/blob/master/image/logo.png" >	
</p>


    Considere el siguiente problema:

    Escriba un programa corto que permita pasar de un formato de tiempo establecido en 3 parámetros (horas, minutos, segundos) a un número entero en milisegundos.
    
    Los inputs de entrada se restringen de la siguiente manera :

	0 <= h <= 23
	0 <= m <= 59
	0 <= s <= 59
	
	En caso de romperse estas cláusualas, el retorno debe de ser -1.

	
    Ejemplo:

	milliseconds.apply(0,1,1) = 61000
    
	milliseconds.apply(1,1,1) = 3661000

	milliseconds.apply(24,10,10) = -1


    En la carpeta 'src/main/java/es/geekshubs/academy/Milliseconds.java' se encuentra el fichero con 
    la definición de nuestro método vacío.
    En la carpeta 'src/test/java/es/geekshubs/academy/MillisecondsTest.java' se encuentra el fichero
    con la suite de test.
    
    El modus operandi de trabajo es el siguiente:
    
    Debes 'forkear' el proyecto a tu cuenta.
    Puedes hacer PR's ilimitadas e ir validando poco a poco la solución contra nuestro respositorio con CI.
    Puedes trabajar en local y subir la solución haciendo un PR a nuestro repositorio.
    Cuando se envíe la PR final, debes indicar el tiempo de dedicación y los intentos que has hecho.
    También puedes añadir un comentario para dar cualquier tipo de feedback.
    
    En caso de duda, revisa en el apartado de 'Referencias'.

    Tests run: 20, Failures: 0, Errors: 0, Skipped: 0

    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time:  4.485 s
    [INFO] Finished at: 2021-05-07T15:41:07+02:00
    [INFO] ------------------------------------------------------------------------
    Process finished with exit code 0



## Referencias

* [Tutorial - Testing Automatizado](https://github.com/GeeksHubsAcademy/2020-js-vanilla-testing-FFFF/blob/master/README.md)
