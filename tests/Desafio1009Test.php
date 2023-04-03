<?php

namespace Tests;

use PHPUnit\Framework\TestCase;
use src\models\Desafio1009;

class Desafio1009Test extends TestCase {
    public function test_deve_ser_true()
    {       

        $desafio1009 = new Desafio1009("Jota", 1700.00, 1230.50);
        $this->assertEquals($desafio1009->calcular(), 1884.58);
    }



}