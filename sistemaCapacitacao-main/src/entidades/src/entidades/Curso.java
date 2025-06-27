package entidades;

public class Curso {
    private int idcurso;
    private String nome;
    private int foto;
    private int formarelizacao;
    private int ofertante;
    private int vagas;
    private double valor;
    private String site;
    private String situacao;

    public Curso (){};



    public Curso(int idcurso, String nome, int foto, int formarelizacao, int ofertante, int vagas, double valor, String site, String situacao) {
        this.idcurso = idcurso;
        this.nome = nome;
        this.foto = foto;
        this.formarelizacao = formarelizacao;
        this.ofertante = ofertante;
        this.vagas = vagas;
        this.valor = valor;
        this.site = site;
        this.situacao = situacao;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getFormarelizacao() {
        return formarelizacao;
    }

    public void setFormarelizacao(int formarelizacao) {
        this.formarelizacao = formarelizacao;
    }

    public int getOfertante() {
        return ofertante;
    }

    public void setOfertante(int ofertante) {
        this.ofertante = ofertante;
    }

    public int getVagas() {
        return vagas;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    @Override
    public String toString() {
        return "Curso{" +
                "idcurso=" + idcurso +
                ", nome='" + nome + '\'' +
                ", foto=" + foto +
                ", formarelizacao=" + formarelizacao +
                ", ofertante=" + ofertante +
                ", vagas=" + vagas +
                ", valor=" + valor +
                ", site='" + site + '\'' +
                ", situacao='" + situacao + '\'' +
                '}';
    }
}