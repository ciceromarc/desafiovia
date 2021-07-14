package br.com.automacao.produto.pages;

import br.com.automacao.produto.core.Element;
import br.com.automacao.produto.enums.ByValue;
import br.com.automacao.produto.maps.PrincipalMap;

public class CadastroCandidatoPage {

    PrincipalMap principalMap = new PrincipalMap();

    public String getHome() {
        return principalMap.txtCabecalho.getText();
    }

    public CadastroCandidatoPage clickMenu(String menu) {
        Element aPesquisaQA = new Element(ByValue.xpath, "//a[text() = '"+menu+"']");
        aPesquisaQA.click();
        return this;
    }

    public CadastroCandidatoPage setInpNome(String nome) {
        principalMap.inpNome.sendKeys(nome);
        return this;
    }

    public CadastroCandidatoPage setSobreNome(String sobrenome) {
        principalMap.inpSobreNome.sendKeys(sobrenome);
        return this;
    }

    public CadastroCandidatoPage setEmail(String email) {
        principalMap.inpEmail.sendKeys(email);
        return this;
    }

    public CadastroCandidatoPage setEmailConfirmacao(String email) {
        principalMap.inpEmailConfirm.sendKeys(email);
        return this;
    }

    public CadastroCandidatoPage clickIdade() {
        principalMap.radIdade.click();
        return this;
    }

    public CadastroCandidatoPage slcTempoArea(String tempo) {
        principalMap.slcTempoArea.selectText(tempo);
        return this;
    }

    public CadastroCandidatoPage slcAtraiu(String motivo) {
        principalMap.slcAtraiu.selectText(motivo);
        return this;
    }

    public CadastroCandidatoPage clickRadMelhoria() {
        principalMap.radMelhoria.click();
        return this;
    }

    public CadastroCandidatoPage setLinguagem(String linguagem) {
        principalMap.inpLinguagem.sendKeys(linguagem);
        return this;
    }

    public CadastroCandidatoPage clickEnviar() {
        principalMap.inpEnviar.click();
        return this;
    }

    public String getSucesso() {
        return principalMap.pSucesso.visibilityOf().getText();
    }

}
