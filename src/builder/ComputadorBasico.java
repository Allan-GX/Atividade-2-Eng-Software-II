package builder;

public class ComputadorBasico {
    public Computador criar() {
        return new Computador.Builder()
                .processador("Intel Core i3")
                .tipoMemoria("DDR3")
                .memoriaGB(8)
                .tipoArmazenamento("HDD")
                .armazenamentoGb(128)
                .fonte("Atx Vkoem 200w bivolt")
                .gabinete("Office Fortrek 258 x 170 x 345 mm")
                .cooler("T-Dagger T-GC9110 90 x 90 x 25 mm")
                .build();
    }
}
