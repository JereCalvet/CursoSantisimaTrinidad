# Respuestas del examen final

## Ejercicio 3
* Respuesta: 
  - b) Calcula el precio total de las bicicletas de la bicicletería. 

## Ejercicio 4
* Respuesta
  - a) Falso
  - b) Verdadero
  - c) Falso
  - d) Verdadero
  - e) Falso
  - f) Falso
  - g) Verdadero


## Ejercicio 5

```sql
SELECT 
      cantVentas as 'Cantidad de ventas', 
      ganancias as 'Ganancias',
      COUNT(bicicleta.nroSerie) as 'Cantidad de bicicletas en venta'
FROM bicicleteria
INNER JOIN bicicleta ON (bicicleteria.idBicicleteria = bicicleta.Bicicleteria_idBicicleteria)
WHERE bicicleteria.idBicicleteria = 2;
```
