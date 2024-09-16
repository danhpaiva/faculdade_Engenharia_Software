using ObterContasUsuarios;

internal class Program
{
    private static void Main(string[] args)
    {
        ObterPorPasta.listarUsuarios();

        Console.WriteLine("________________________________\n");

        ObterDoSistema.listarUsuarios();
    }
}