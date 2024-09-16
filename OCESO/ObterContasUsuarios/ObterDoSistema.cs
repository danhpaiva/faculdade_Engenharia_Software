using System.Management;

namespace ObterContasUsuarios
{
    public static class ObterDoSistema
    {
        public static void listarUsuarios()
        {
            string query = "SELECT * FROM Win32_UserAccount WHERE LocalAccount = TRUE";
            ManagementObjectSearcher resultado = new ManagementObjectSearcher(query);
            ManagementObjectCollection usuarios = resultado.Get();

            foreach (ManagementObject usuario in usuarios)
            {
                // Exibe o nome do usuário e o status da conta
                string nomeUsuario = usuario["Name"].ToString();

                string tipoUsuario = usuario["SIDType"].ToString();
                switch (tipoUsuario)
                {
                    case "1":
                        tipoUsuario = "Usuário Normal";
                        break;
                    case "2":
                        tipoUsuario = "Grupo";
                        break;
                    case "3":
                        tipoUsuario = "Domínio";
                        break;
                    case "5":
                        tipoUsuario = "Conta Bem Conhecida (Administrador ou Convidado)";
                        break;
                    case "6":
                        tipoUsuario = "Usuário Deletado";
                        break;
                    default:
                        tipoUsuario = "Outro";
                        break;
                }

                Console.WriteLine($"Usuário: {nomeUsuario} | Tipo: {tipoUsuario}");
            }

        }
    }
}
