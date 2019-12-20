# Test4
Calcualdora

Segun requerimiento el objeto que voy a crear para las operaciones va a ser bastante sensillo, solo se nesecitarian dos servicios de suma y resta basicos, por eso no veo la necesidad de utilizar librerias de java 8. Si hubieran sido operaciones mas complejas con listas de datos y con operaciones concatenadas habria sido util mapear y utilizar stream para reducir lineas de codigo y agilizar calculos.
El objeto servicios sera lo que se comunicará con la clase controller quese ocupará de reindirizarlos, y serian de tipo POST se les pasa un inout y envia los datos procesados a la pagina, solo se envia el dato reuqerido segun la operacion en input operación.
El Model de las operaciones será lo que mapea los input de la calculadora y lo despensa a los servicios y al controller.

 - He creado el repositorio en GitHub con Nombre Test4 y lo he clonado.
 - He creado el proyecto Springboot - maven en eclipse con la exstensión de springboot para eclipse.
 - He subido el proyecto a ghithub en la rama master como starter commit 
 - He inicializato el proyecto creandome la rama de develop donde subiré mis commits
 - He impezado creandome la clase de model donde creo el bean para las operaciones.
 - He elegido dos variables de tipo double que me dan una mayor precisión matematica y para los signos de las operaciones he elegido una      variable de tipo string.
 - He definido el costructor y los getters y setters.
 - Utilizare este model para construir los servicios en la clase servicios.
 - He creado un servicio de suma que recoge los valores del model para sumarlo, siendo un servicio sencillo que recoge dos datos y            devuelve una suma, no he utilizado ninguna libreria avanzada de java 8.
 - Mismo caso con la resta. No he visto necesario añadir ninguna particularidad a las operaciones.
 - He añadido vario trace para tener cuenta de los datos que se introducen y si hai excepciones tener costanciade del error.
 - Creo el controller donde se llaman los servicios. He elegido metodos de llamadas privados para una mayor seguridad.
 - Los metodos del controller reciben como dato el tipo de operacion y desde el tipo llaman suma o resta.
 - Los servicios será de tipo POST enviando datos de suma y resta segun la elección.
 - He desarrollado una pequeña interface con spring boot thymeleaf para la calculadora en html que he conectado a los servicios en el        controller.
 - He tenido que revisar los paths de los servicios y añadir unas dependencias para que se lanze el tomcat en local y se pueda ver la        pagina.
 - La pagina de front nos permite introducir los input de las operaciones y variables.
 - Monto los test unitarios para los servicios.
 - Utilizo junit5.
 - antes de empezar con los test lanzo el programa para ver si compila.
 - He tenido que reorganizar el nivel estructural de las clases porque no eran al nivel  estructural adeguado para que los servicios del    controller mapearan de forma adeguada el path a la pagina web.
 - Compilando el projecto he comprobado que la pagina se habre bien en el localhost y que me permite de insertar correctamente los          input.
 - He probado varios input mirando que si los imput no coinciden con el tipo y formado requerido de un double, la app da un error y saca    un mensaje del trace como me esperaba.
 - Se deberia parsear el input para que los datos entren siempre en cualquier caso de forma correcta y pone un bloque para que no se        inserten valores de tipo char.
 - Paso a las creacion de los tests.
 
 
 
  
