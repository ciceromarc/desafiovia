package br.com.automacao.produto.maps;


import br.com.automacao.produto.core.Element;
import br.com.automacao.produto.enums.ByValue;

public class PrincipalMap {
    public Element txtCabecalho = new Element("a[rel='home']");
    public Element inpNome = new Element("input[name='fname']");
    public Element inpSobreNome = new Element("input[name='lname']");
    public Element inpEmail = new Element("input[name='email']");
    public Element inpEmailConfirm = new Element("input[name='nf-field-8']");
    public Element inpPhone = new Element("input[name='phone']");
    public Element radIdade = new Element(ByValue.xpath,"//label[text() = '31-49']");
    public Element slcTempoArea = new Element("#nf-field-11");
    public Element slcAtraiu = new Element("#nf-field-12");
    public Element radMelhoria = new Element(ByValue.xpath, "//label[text() = 'Negócio']");
    public Element inpLinguagem = new Element("#nf-field-14");
    public Element carreira = new Element("textarea");
    public Element inpEnviar = new Element("input[value='Enviar']");
    public Element pSucesso = new Element("div.nf-response-msg > p");
}
