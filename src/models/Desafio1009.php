<?php

namespace src\models;

class Desafio1009 {

    const TAXA = 0.15;
    
    private string $nome;
    private float $salario;
    private float $vendas;

    private float $extra;

    public function __construct(string $nome, float $salario, float $vendas)
    {
        $this->nome = $nome;
        $this->salario = $salario;
        $this->vendas = $vendas;
    }
	/**
	 * @return string
	 */
	public function getNome(): string {
		return $this->nome;
	}
	
	/**
	 * @param string $nome 
	 * @return self
	 */
	public function setNome(string $nome): self {
		$this->nome = $nome;
		return $this;
	}
	
	/**
	 * @return float
	 */
	public function getSalario(): float {
		return $this->salario;
	}
	
	/**
	 * @param float $salario 
	 * @return self
	 */
	public function setSalario(float $salario): self {
		$this->salario = $salario;
		return $this;
	}
	
	/**
	 * @return float
	 */
	public function getVendas(): float {
		return $this->vendas;
	}
	
	/**
	 * @param float $vendas 
	 * @return self
	 */
	public function setVendas(float $vendas): self {
		$this->vendas = $vendas;
		return $this;
	}

    public function calcular()
    {
       $this->extra = bcmul((string) $this->vendas, (string) self::TAXA, 2);
       $total = bcadd((string) $this->getSalario(), (string) $this->extra, 2);
       
       return number_format($total, 2, '.', ''); 
    }


    /**
     * Get the value of extra
     */ 
    public function getExtra()
    {
        return $this->extra;
    }

    /**
     * Set the value of extra
     *
     * @return  self
     */ 
    public function setExtra($extra)
    {
        $this->extra = $extra;

        return $this;
    }
}