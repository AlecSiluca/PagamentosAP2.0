package uea.pagamentos_api.repositories.filters;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class LancamentoFilter {
	
	private String descricao;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate dataVencimentoDia;
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private LocalDate dataVencimentoAte;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
	public LocalDate getDataVencimentoDia() {
		return dataVencimentoDia;
	}
	public void setDataVencimentoDia(LocalDate dataVencimentoDia) {
		this.dataVencimentoDia = dataVencimentoDia;
	}
	public LocalDate getDataVencimentoAte() {
		return dataVencimentoAte;
	}
	public void setDataVencimentoAte(LocalDate dataVencimentoAte) {
		this.dataVencimentoAte = dataVencimentoAte;
	}
	
	
}
