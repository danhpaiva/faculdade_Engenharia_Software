namespace ObterContasUsuarios
{
    public static class ObterPorPasta
    {
        public static void listarUsuarios()
        {
            string diretorioUsers = @"C:\Users";

            string[] pastaUsuarios = Directory.GetDirectories(diretorioUsers);

            Console.WriteLine("Usuários da pasta:");
            foreach (string pasta in pastaUsuarios)
            {
                string nomeUsuario = Path.GetFileName(pasta);
                Console.WriteLine(nomeUsuario);
            }
        }
    }
}