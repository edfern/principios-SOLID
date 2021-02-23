package gt.edu.umg.priciple.solid.model.service;

import gt.edu.umg.priciple.solid.model.dto.GenericObject;

public interface IExportFile {
    /**
     * Cada clase que implemente esta interfaz tiene como finalidad construir el
     * el formato que soporta el programa, en este caso se limita a los
     * formatos JSON, HTML Y CSV.
     */

    public GenericObject buildFile();

}