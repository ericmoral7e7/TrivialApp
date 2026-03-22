package com.example.trivialapp.domain

import com.example.trivialapp.data.Pregunta

class PreguntasProvider {
    private val preguntas: MutableList<Pregunta> = mutableListOf()

    init {
        var dificulty = 1
        preguntas.add(Pregunta("¿Cuál es el color que resulta de mezclar azul y amarillo?", listOf("Verde", "Rojo", "Morado", "Naranja"), dificulty))
        preguntas.add(Pregunta("¿En qué continente se encuentra España?", listOf("Europa", "América", "Asia", "África"), dificulty))
        preguntas.add(Pregunta("¿Cuántos días tiene un año bisiesto?", listOf("366", "365", "364", "360"), dificulty))
        preguntas.add(Pregunta("¿Cuál es el océano más grande de la Tierra?", listOf("Océano Pacífico", "Océano Atlántico", "Océano Índico", "Océano Ártico"), dificulty))
        preguntas.add(Pregunta("¿Quién es el autor de 'Don Quijote de la Mancha'?", listOf("Miguel de Cervantes", "Federico García Lorca", "Gabriel García Márquez", "Lope de Vega"), dificulty))
        preguntas.add(Pregunta("¿Qué órgano del cuerpo humano bombea sangre?", listOf("Corazón", "Pulmones", "Hígado", "Cerebro"), dificulty))
        preguntas.add(Pregunta("¿Cuál es el planeta más cercano al Sol?", listOf("Mercurio", "Venus", "Tierra", "Marte"), dificulty))
        preguntas.add(Pregunta("¿Cómo se llama el proceso por el cual las plantas obtienen energía de la luz?", listOf("Fotosíntesis", "Respiración", "Combustión", "Evaporación"), dificulty))
        preguntas.add(Pregunta("¿Qué animal es conocido como el 'Rey de la Selva'?", listOf("León", "Tigre", "Elefante", "Cebra"), dificulty))
        preguntas.add(Pregunta("¿Cuál es la capital de Francia?", listOf("París", "Londres", "Madrid", "Berlín"), dificulty))
        preguntas.add(Pregunta("¿Cuántos lados tiene un hexágono?", listOf("Seis", "Cinco", "Siete", "Ocho"), dificulty))
        preguntas.add(Pregunta("¿En qué país se encuentran las Pirámides de Giza?", listOf("Egipto", "México", "Grecia", "Perú"), dificulty))
        preguntas.add(Pregunta("¿Cuál es el metal cuyo símbolo químico es Au?", listOf("Oro", "Plata", "Cobre", "Hierro"), dificulty))
        preguntas.add(Pregunta("¿Qué idioma se habla principalmente en Brasil?", listOf("Portugués", "Español", "Francés", "Inglés"), dificulty))
        preguntas.add(Pregunta("¿Quién pintó la 'Mona Lisa'?", listOf("Leonardo da Vinci", "Pablo Picasso", "Vincent van Gogh", "Salvador Dalí"), dificulty))
        preguntas.add(Pregunta("¿Cuál es el satélite natural de la Tierra?", listOf("La Luna", "Titán", "Europa", "Ganímedes"), dificulty))
        preguntas.add(Pregunta("¿Qué instrumento musical tiene teclas blancas y negras?", listOf("Piano", "Guitarra", "Violín", "Flauta"), dificulty))
        preguntas.add(Pregunta("¿Cómo se llama el resultado de una multiplicación?", listOf("Producto", "Suma", "Cociente", "Diferencia"), dificulty))
        preguntas.add(Pregunta("¿Cuál es el país más grande del mundo por superficie?", listOf("Rusia", "Canadá", "China", "Estados Unidos"), dificulty))
        preguntas.add(Pregunta("¿A qué temperatura hierve el agua a nivel del mar?", listOf("100°C", "90°C", "120°C", "80°C"), dificulty))


        dificulty = 2

        preguntas.add(Pregunta("¿En qué año comenzó la Segunda Guerra Mundial?", listOf("1939", "1914", "1945", "1929"), dificulty))
        preguntas.add(Pregunta("¿Cuál es la montaña más alta del mundo?", listOf("Monte Everest", "K2", "Kangchenjunga", "Anapurna"), dificulty))
        preguntas.add(Pregunta("¿Qué gas necesitan los seres humanos para respirar?", listOf("Oxígeno", "Nitrógeno", "Dióxido de carbono", "Hidrógeno"), dificulty))
        preguntas.add(Pregunta("¿Quién escribió 'Cien años de soledad'?", listOf("Gabriel García Márquez", "Mario Vargas Llosa", "Julio Cortázar", "Isabel Allende"), dificulty))
        preguntas.add(Pregunta("¿Cuál es el elemento más abundante en la atmósfera terrestre?", listOf("Nitrógeno", "Oxígeno", "Argón", "Helio"), dificulty))
        preguntas.add(Pregunta("¿Qué ciudad es conocida como la 'Ciudad Eterna'?", listOf("Roma", "Atenas", "Jerusalén", "Venecia"), dificulty))
        preguntas.add(Pregunta("¿Cuál es el hueso más largo del cuerpo humano?", listOf("Fémur", "Húmero", "Tibia", "Radio"), dificulty))
        preguntas.add(Pregunta("¿En qué país nació Adolf Hitler?", listOf("Austria", "Alemania", "Polonia", "Hungría"), dificulty))
        preguntas.add(Pregunta("¿Cuál es la capital de Australia?", listOf("Canberra", "Sídney", "Melbourne", "Perth"), dificulty))
        preguntas.add(Pregunta("¿Quién desarrolló la teoría de la relatividad?", listOf("Albert Einstein", "Isaac Newton", "Nikola Tesla", "Stephen Hawking"), dificulty))
        preguntas.add(Pregunta("¿Cuál es el río más largo del mundo?", listOf("Amazonas", "Nilo", "Misisipi", "Yangtsé"), dificulty))
        preguntas.add(Pregunta("¿Qué país ganó el Mundial de Fútbol de 2010?", listOf("España", "Holanda", "Alemania", "Brasil"), dificulty))
        preguntas.add(Pregunta("¿Qué tipo de animal es una ballena?", listOf("Mamífero", "Pez", "Reptil", "Anfibio"), dificulty))
        preguntas.add(Pregunta("¿Cuál es el nombre de la sustancia que da color a nuestra piel?", listOf("Melanina", "Queratina", "Hemoglobina", "Clorofila"), dificulty))
        preguntas.add(Pregunta("¿En qué año llegó el hombre a la Luna?", listOf("1969", "1961", "1972", "1959"), dificulty))
        preguntas.add(Pregunta("¿Cuál es la capital de Canadá?", listOf("Ottawa", "Toronto", "Vancouver", "Montreal"), dificulty))
        preguntas.add(Pregunta("¿Qué filósofo fue el maestro de Alejandro Magno?", listOf("Aristóteles", "Platón", "Sócrates", "Heráclito"), dificulty))
        preguntas.add(Pregunta("¿Cuál es la moneda oficial de Japón?", listOf("Yen", "Yuan", "Won", "Dólar"), dificulty))
        preguntas.add(Pregunta("¿Cuántos elementos tiene la tabla periódica actualmente?", listOf("118", "115", "120", "110"), dificulty))
        preguntas.add(Pregunta("¿Qué pintor es famoso por sus obras cubistas?", listOf("Pablo Picasso", "Claude Monet", "Rembrandt", "Edvard Munch"), dificulty))

        dificulty = 3

        preguntas.add(Pregunta("¿Cuál es la ciudad más antigua del mundo que aún está habitada?", listOf("Damasco", "Jericó", "Biblos", "Alepo"), dificulty))
        preguntas.add(Pregunta("¿Quién fue el primer emperador romano?", listOf("César Augusto", "Julio César", "Nerón", "Calígula"), dificulty))
        preguntas.add(Pregunta("¿Cuál es el único metal que es líquido a temperatura ambiente?", listOf("Mercurio", "Galio", "Cesio", "Francio"), dificulty))
        preguntas.add(Pregunta("¿En qué batalla fue derrotado definitivamente Napoleón Bonaparte?", listOf("Waterloo", "Austerlitz", "Leipzig", "Trafalgar"), dificulty))
        preguntas.add(Pregunta("¿Cuál es el nombre de la partícula subatómica con carga negativa?", listOf("Electrón", "Protón", "Neutrón", "Positrón"), dificulty))
        preguntas.add(Pregunta("¿Quién escribió la ópera 'La flauta mágica'?", listOf("Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Richard Wagner", "Giuseppe Verdi"), dificulty))
        preguntas.add(Pregunta("¿Qué país africano fue el único que nunca fue colonizado?", listOf("Etiopía", "Liberia", "Egipto", "Sudáfrica"), dificulty))
        preguntas.add(Pregunta("¿Cuál es la obra literaria más antigua que se conoce?", listOf("Poema de Gilgamesh", "La Ilíada", "El Libro de los Muertos", "Mahabharata"), dificulty))
        preguntas.add(Pregunta("¿En qué año se disolvió la Unión Soviética?", listOf("1991", "1989", "1993", "1990"), dificulty))
        preguntas.add(Pregunta("¿Qué científico propuso la ley de la gravitación universal?", listOf("Isaac Newton", "Johannes Kepler", "Galileo Galilei", "Tycho Brahe"), dificulty))
        preguntas.add(Pregunta("¿Cuál es el desierto más seco del mundo?", listOf("Atacama", "Sáhara", "Gobi", "Kalahari"), dificulty))
        preguntas.add(Pregunta("¿A qué familia de instrumentos pertenece el oboe?", listOf("Madera", "Metal", "Cuerda", "Percusión"), dificulty))
        preguntas.add(Pregunta("¿Quién fue el arquitecto principal de la Sagrada Familia en Barcelona?", listOf("Antoni Gaudí", "Le Corbusier", "Frank Lloyd Wright", "Oscar Niemeyer"), dificulty))
        preguntas.add(Pregunta("¿Qué gas de efecto invernadero es el principal responsable del calentamiento global?", listOf("Dióxido de carbono", "Metano", "Óxido nitroso", "Ozono"), dificulty))
        preguntas.add(Pregunta("¿Cuál es la capital de Kazajistán?", listOf("Astaná", "Almaty", "Biskek", "Taskent"), dificulty))
        preguntas.add(Pregunta("¿En qué siglo comenzó la Revolución Industrial?", listOf("Siglo XVIII", "Siglo XVII", "Siglo XIX", "Siglo XVI"), dificulty))
        preguntas.add(Pregunta("¿Qué estrecho separa España de Marruecos?", listOf("Estrecho de Gibraltar", "Estrecho de Magallanes", "Estrecho de Bering", "Estrecho de Ormuz"), dificulty))
        preguntas.add(Pregunta("¿Cuál es la unidad de medida de la resistencia eléctrica?", listOf("Ohmio", "Voltio", "Amperio", "Vatio"), dificulty))
        preguntas.add(Pregunta("¿Quién fue la primera mujer en ganar un Premio Nobel?", listOf("Marie Curie", "Rosalind Franklin", "Ada Lovelace", "Irène Joliot-Curie"), dificulty))
        preguntas.add(Pregunta("¿En qué archipiélago se encuentra la isla de Pascua?", listOf("Polinesia", "Melanesia", "Micronesia", "Antillas"), dificulty))
    }

    // Devuelve 10 preguntas aleatorias de la dificultad elegida sin repetir
    fun getPreguntasParaPartida(difficulty: Int, cantidad: Int = 10): List<Pregunta> {
        return preguntas
            .filter { it.difficulty == difficulty }
            .shuffled() // Las barajamos todas
            .take(cantidad) // Nos quedamos solo con las 10 primeras
    }
}