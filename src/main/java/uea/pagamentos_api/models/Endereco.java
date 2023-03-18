package uea.pagamentos_api.models;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable

public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@NotBlank(message = "Lagradouro é obrigatorio")
	@Size(min = 3, max = 20, message = "O Lagradouro deve ter tamanho entre 5 e 30 caracteres")
	private String logradouro;
	
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;

	public String getLagradouro() {
		return logradouro;
	}

	public void setLagradouro(String lagradouro) {
		this.logradouro = lagradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Endereco(String lagradouro, String numero, String complemento, String bairro, String cep, String cidade,
			String estado) {
		super();
		this.logradouro = lagradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}

	public Endereco() {
		super();
	}

}
