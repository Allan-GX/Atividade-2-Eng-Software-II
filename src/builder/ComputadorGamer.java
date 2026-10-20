package builder;

public class ComputadorGamer {
    public Computador criar() {
        return new Computador.Builder()
                .processador("AMD Ryzen 7 9800X3D")
                .tipoMemoria("DDR5")
                .memoriaGB(128)
                .tipoArmazenamento("NVMe")
                .armazenamentoGb(4000)
                .fonte("Power Zone 1200w 80 Plus Platinum bivolt")
                .gabinete("ATX Full-Tower 7000D AIRFLOW 248 x 550 x 600 mm")
                .placaDeVideo("RTX 5090 Gaming OC 32gb Gigabyte")
                .cooler("Liquid Freezer III 420")
                .build();
    }
}
