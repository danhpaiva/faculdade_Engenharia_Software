package Lista4_Fabricio;

public enum Parametros {

    CONDICAODEPARADAEX1(99999),
    CONDICAODEPARADAEX2(0),
    Retangulo(1),
    DiagonalSuperiorEsquerda(2),
    DiagonalSuperiorDireita(3),
    DiagonalInferiorEsquerda(4),
    DiagonalInferiorDireita(5);


    private final int valor;

    private Parametros(final int valor)
    {
        this.valor = valor;
    }

    public int getValor()
    {
        return this.valor;
    }


}
