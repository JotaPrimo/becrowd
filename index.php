<?php

require_once __DIR__ . "/vendor/autoload.php";
use src\models\Desafio1009;

$desafio1009 = new Desafio1009("Jota", 1700.00, 1230.50);
echo $desafio1009->calcular();