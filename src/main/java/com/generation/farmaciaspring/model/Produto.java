package com.generation.farmaciaspring.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "tb_produto")

public class Produto {
	
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank (message = "O nome do medicamento é obrigatório!")
	@Size(min = 2, max = 50, message = "O nome deve conter no mínimo 1 e no máximo 50 caracteres!")
	@Column (length = 50)
	private String nome;
	
	@Size(min = 1, max = 10, message = "A dosagem do medicamento deve conter no mínimo 1 e no máximo 10 caracteres!")
	@Column (length = 10)
	private String dosagem;
	
	@NotBlank (message = "Informe qual o nome do fabricante!")
	@Size(min = 3, max = 20, message = "O nome do fabricante deve conter no mínimo 3 e no máximo 20 caracteres!")
	@Column (length = 20)
	private String fabricante;
	
	@NotNull (message = "Não é possível criar sem quantidade.")
	@Positive (message = "A quantidade deve ser um número maior que zero.")
	private int quantidade;
	
	@NotNull (message = "Não é possível criar um produto sem o preço!")
	@Positive (message = "O valor deve ser maior que zero!")
    private float preco;
	
	@NotBlank (message = "Insira uma foto para o seu produto!")
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("Produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDosagem() {
		return dosagem;
	}

	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}

	
	

