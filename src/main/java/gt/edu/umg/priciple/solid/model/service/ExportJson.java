package gt.edu.umg.priciple.solid.model.service;

import gt.edu.umg.priciple.solid.model.dto.GenericObject;
import gt.edu.umg.priciple.solid.model.entity.FileEntity;


public class ExportJson implements IExportFile {
    public ExportJson() {
    }
    public GenericObject buildFile() {
        FileEntity entity = new FileEntity();
        entity.setNameFile("example.json");
        entity.setSizeFile("1.5MB");
        return new GenericObject(entity);
    }

}