class Paciente {
    private int codigo;
    private String nome;
    private String data;
    private String sexo;
    private String plano;
    private String alergia;
    private String sangue;

    public Paciente(int codigo, String nome, String data, String sexo, String plano, String alergia, String sangue) {
        this.codigo = codigo;
        this.nome = nome;
        this.data = data;
        this.sexo = sexo;
        this.plano = plano;
        this.alergia = alergia;
        this.sangue = sangue;
    }

    public int getCodigo() {

        return codigo;
    }

    public void setCodigo(int codigo) {

        this.codigo = codigo;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getData() {

        return data;
    }

    public void setData(String data) {

        this.data = data;
    }

    public String getSexo() {

        return sexo;
    }

    public void setSexo(String sexo) {

        this.sexo = sexo;
    }

    public String getPlano() {

        return plano;
    }

    public void setPlano(String plano) {

        this.plano = plano;
    }

    public String getAlergia() {

        return alergia;
    }

    public void setAlergia(String alergia) {

        this.alergia = alergia;
    }

    public String getSangue() {

        return sangue;
    }

    public void setSangue(String sangue) {

        this.sangue = sangue;
    }
}
