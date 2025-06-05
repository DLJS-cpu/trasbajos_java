package mensajeanimo;

public class MensajeAnimo {
    private static final String NOMBRE_STRING = "Carlos";
    private static String estadoDeAnimo = "triste";

    public static String mensajeDeAnimo(String nombreUsuario, String estado) {
        if (estado == null) {
            return "¡Hola, " + nombreUsuario + "! Recuerda que cada día es una nueva oportunidad ";
        } else
            return switch (estado) {
                case "triste" -> "¡Ánimo, " + nombreUsuario + "! Todo va a mejorar, sigue adelante";
                case "feliz" -> "¡Qué bueno, " + nombreUsuario + "! Sigue disfrutando ese buen ánimo ";
                default -> "¡Hola, " + nombreUsuario + "! Recuerda que cada día es una nueva oportunidad ";
            };
    }

    public static void main(String[] args) {
        System.out.println(mensajeDeAnimo(NOMBRE_STRING, estadoDeAnimo));
    }

    public static String getEstadoDeAnimo() {
        return estadoDeAnimo;
    }

    public static void setEstadoDeAnimo(String estadoDeAnimo) {
        MensajeAnimo.estadoDeAnimo = estadoDeAnimo;
    }
}
