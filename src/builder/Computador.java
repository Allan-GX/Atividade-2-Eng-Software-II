package builder;

import java.security.InvalidParameterException;

public class Computador {

    private String processador;
    private String tipoMemoria;
    private double memoriaGb;
    private String tipoArmazenamento;
    private double armazenamentoGb;
    private String fonte;
    private String gabinete;
    private String placaDeVideo;
    private String Cooler;

    public Computador(Builder builder) {
        this.processador = builder.processador;
        this.tipoMemoria = builder.tipoMemoria;
        this.memoriaGb = builder.memoriaGb;
        this.tipoArmazenamento = builder.tipoArmazenamento;
        this.armazenamentoGb = builder.armazenamentoGb;
        this.fonte = builder.fonte;
        this.gabinete = builder.gabinete;
        this.placaDeVideo = builder.placaDeVideo;
        this.Cooler = builder.Cooler;
    }

    public static class Builder {

        private String ;
        private String ;
        private String ;
        private double ;
        private double ;
        private int ;
        private String ;
        private boolean ;
        private String ;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder codigo(String codigo) {
            this.codigo = codigo;
            return this;
        }

        public Builder descricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder preco(double preco) {
            this.preco = preco;
            return this;
        }

        public Builder custo(double custo) {
            this.custo = custo;
            return this;
        }

        public Builder estoque(int estoque) {
            if(estoque < 0) {
                throw new InvalidParameterException("O valor do estoque deve ser maior ou igual a 0");
            }
            this.estoque = estoque;
            return this;
        }

        public Builder unidade(String unidade) {
            this.unidade = unidade;
            return this;
        }

        public Builder ativo(boolean ativo) {
            this.ativo = ativo;
            return this;
        }

        public Builder ncm(String ncm) {
            this.ncm = ncm;
            return this;
        }

        public Computador build() {
            if(codigo == null || codigo.isEmpty()) {
                throw new InvalidParameterException("O código é obrigatorio");
            }

            return new Computador(this);
        }
    }

}

