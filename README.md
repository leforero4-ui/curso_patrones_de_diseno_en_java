driver que su implementación la conducimos nosotros

driven que su implementación es conducida por otro

las clases que representan objetos(sustantivos) al menos inicialmente extienden de clases abstractas y no implementan interfaces, por lo que si se necesita un comportamiento es mejor la composición que la herencia

las clases que representan comportamientos(advervios) al menos inicialmente implementan interfaces y no clases abstractas

patrones de diseño:

creacional

* builder: creación de player, ayuda cuando es inmutable osea que tiene sus propiedades finales, y muchos de sus parametros pueden ser null porque tendría varios constructores para evitar el parámetro null

* factory method: lógica de crear villanos por niveles

* singleton: para crear el villano supremo, debe ser único

* prototype: para clonar los soldados cuando se están creando los villanos por niveles

* abstract factory: para crear el juego por armada: naval, o aérea


estructural

* composite: crear infanteria con sus escuadrones y soldados que ataquen al mismo tiempo

* flyweight: compartir la ropa de los soldados (estado intrinseco/extrinseco)

* facade: interface expuesta a las aplicaciones ocultando las complejidades del juego, logros, y estadisticas, en este caso la clase Controller.java

* adapter: usar librerias externas como Lanterna para dibujar en consola

* bridge: habilidad de cada enemigo que usa para atacar

* decorator: para meter algunos enemigos en un fuerte brindandole una protección extra

* proxy: ya que controller es un recurso pesado se le puede aplicar un proxy virtual para que se inicialice solo si se usa,
y un proxy de caché para obtener las estadisticas por nivel ya que puede ser pesado su calculo,
y un proxy de protección para no ver los logros si se ha iniciado en beta

comportamiento

* iterator: recorrer el tablero del juego para dibujar los enemigos

* strategy: estrategía(habilidad) para calcular el nivel de ataque de cada enemigo

* mediator: interface que controla los ataques y los contraataques entre el jugador y los enemigos, en este caso GameableUseCase.java

* observer: para que los protectores del enemigo supremo reciban un porcentaje del ataque

* visitor: debido a que los enemigos y el jugador no deberían poder recuperarse se saca la funcionalidad aparte para que no afecte las clases Soldier, Squadron, Supreme y Player

* interpreter: para buscar enemigos por tipos en el tablero  
enemigo ::= 'soldado'|'S'|'fortaleza'|'f'|'escuadron'|'e'|'maestro'|'supremo'|'m'  
conjución ::= enemigo '&' enemigo  
alternativa ::= enemigo '|' enemigo  
expresión ::= enemigo | conjución | alternativa | '('expresión')'
