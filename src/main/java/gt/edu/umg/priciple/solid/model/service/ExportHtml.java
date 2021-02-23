package gt.edu.umg.priciple.solid.model.service;

import gt.edu.umg.priciple.solid.model.dto.GenericObject;
import gt.edu.umg.priciple.solid.model.entity.FileEntity;


public class ExportHtml implements IExportFile {

    public ExportHtml() {
    }
    public GenericObject buildFile() {
        FileEntity entity = new FileEntity();
        entity.setNameFile("example.html");
        entity.setSizeFile("5.0MB");
        return new GenericObject(entity);
    }

}