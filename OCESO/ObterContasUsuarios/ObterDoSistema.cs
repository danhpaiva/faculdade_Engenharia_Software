using System.Management;

namespace ObterContasUsuarios
{
    public static class ObterDoSistema
    {
        public static void listarUsuarios()
        {
            string query = "SELECT * FROM Win32_UserAccount WHERE LocalAccount = TRUE";
            ManagementObjectSearcher searcher = new ManagementObjectSearcher(query);
            ManagementObjectCollection usuarios = searcher.Get();

            foreach (ManagementObject usuario in usuarios)
            {
                // Exibe o nome do usuário e o status da conta
                string nomeUsuario = usuario["Name"].ToString();

                Console.WriteLine($"Usuário: {nomeUsuario}");
            }

        }
    }
}
