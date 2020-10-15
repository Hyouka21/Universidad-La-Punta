
package universidad.entidades;

/**
 *
 * @author joni
 */
public class Inscripcion {
    private int idInscripcion;
    Alumno alumno;
    Materia materia;
    private double nota;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, Alumno alumno, Materia materia, double nota) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(int idInscripcion, double nota) {
        this.idInscripcion = idInscripcion;
        this.nota = nota;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public double getNota() {
        return nota;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
    
}
