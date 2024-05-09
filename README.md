Descripcion del desafio: 
Conversor de Monedas para practicar el uso de API, manipular datos JSON y filtrar informacion de interes.

API utilizada: https://www.exchangerate-api.com/


1. **Presentación del menú y selección de opción:**
   - El programa muestra un menú de opciones al usuario para convertir entre diferentes monedas.
   - El usuario ingresa un número para seleccionar la opción deseada.

2. **Manejo de la opción seleccionada:**
   - Se utiliza un bloque `switch-case` para determinar qué conversión de moneda realizar, según la opción seleccionada por el usuario.
   - Cada caso asigna valores a las variables `monedaOriginal`, `monedaCambio` y `tipoDeCambio` según la conversión de moneda elegida.

3. **Obtención de la tasa de conversión:**
   - Si el usuario no ha elegido salir (`case 7`), el programa utiliza un objeto de tipo `BusquedaMonedas` para obtener un mapa de tasas de conversión.
   - Utiliza las monedas originales y de cambio seleccionadas previamente para acceder a la tasa de conversión correspondiente en el mapa.
   - Esta tasa de conversión se almacena en un objeto `BigDecimal`.

4. **Impresión del resultado:**
   - Después de obtener la tasa de conversión, el programa imprime un mensaje que indica la conversión realizada y la tasa de cambio obtenida.
   - Esto se hace dentro de un bloque `if-else` para evitar imprimir el mensaje de despedida si el usuario eligió salir.

5. **Manejo de errores:**
   - Se captura la excepción `NumberFormatException` si el usuario ingresa un valor que no es un número entero al seleccionar una opción del menú.
   - En caso de error, se imprime un mensaje indicando al usuario que ingrese un número entero válido.

6. **Bucle de repetición y salida del programa:**
   - Todo el proceso se repite en un bucle `while` mientras la variable `ciclo` sea `true`.
   - El bucle se detiene cuando el usuario selecciona la opción para salir (`case 7`), momento en el cual se establece `ciclo` a `false`.
