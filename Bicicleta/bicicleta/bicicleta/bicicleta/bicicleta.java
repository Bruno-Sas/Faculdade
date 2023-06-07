package bicicleta;

class bicicleta {
    
    private int velocidadActual;
    private int marchaActual;
    private int cadenciaActual;

    public bicicleta() {
        velocidadActual = 0;
        marchaActual = 1;
        cadenciaActual = 0;
    }

    public void cambiarMarcha(int nuevaMarcha) {
        marchaActual = nuevaMarcha;
    }

    public void aumentarVelocidad(int incremento) {
        velocidadActual += incremento;
    }

    public void disminuirVelocidad(int decremento) {
        velocidadActual -= decremento;
    }

    public void imprimirEstado() {
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        System.out.println("Marcha actual: " + marchaActual);
        System.out.println("Cadencia actual: " + cadenciaActual + " rpm");
        }
    }



