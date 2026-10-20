package builder;

public class Computador {

    private String processador;
    private String tipoMemoria;
    private double memoriaGb;
    private String tipoArmazenamento;
    private double armazenamentoGb;
    private String fonte;
    private String gabinete;
    private String placaDeVideo;
    private String cooler;

    public Computador(Builder builder) {
        this.processador = builder.processador;
        this.tipoMemoria = builder.tipoMemoria;
        this.memoriaGb = builder.memoriaGb;
        this.tipoArmazenamento = builder.tipoArmazenamento;
        this.armazenamentoGb = builder.armazenamentoGb;
        this.fonte = builder.fonte;
        this.gabinete = builder.gabinete;
        this.placaDeVideo = builder.placaDeVideo;
        this.cooler = builder.cooler;
    }

    public static class Builder {

        private String processador;
        private String tipoMemoria;
        private double memoriaGb;
        private String tipoArmazenamento;
        private double armazenamentoGb;
        private String fonte;
        private String gabinete;
        private String placaDeVideo;
        private String cooler;

        public Builder processador(String processador) {
            this.processador = processador;
            return this;
        }

        public Builder tipoMemoria (String tipoMemoria) {
            this.tipoMemoria = tipoMemoria;
            return this;
        }

        public Builder memoriaGB (double memoriaGb) {
            this.memoriaGb = memoriaGb;
            return this;
        }

        public Builder tipoArmazenamento (String tipoArmazenamento) {
            this.tipoArmazenamento = tipoArmazenamento;
            return this;
        }

        public Builder armazenamentoGb (double armazenamentoGb) {
            this.armazenamentoGb = armazenamentoGb;
            return this;
        }

        public Builder fonte (String fonte) {
            this.fonte = fonte;
            return this;
        }

        public Builder gabinete(String gabinete) {
            this.gabinete = gabinete;
            return this;
        }

        public Builder placaDeVideo (String placaDeVideo) {
            this.placaDeVideo = placaDeVideo;
            return this;
        }

        public Builder cooler (String cooler) {
            this.cooler = cooler;
            return this;
        }


        public Computador build() {
            return new Computador(this);
        }
    }

}

