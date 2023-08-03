package Architecture_HW_01.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    
    private List<PolygonalModel> models;
    private List<Flash> flashes;
    private List<Camera> cameras;

    public Scene() {
        models = new ArrayList<>();
        flashes = new ArrayList<>();
        cameras = new ArrayList<>();
    }

    public void addModel() {
        models.add(new PolygonalModel());
    }

    public void removeModel(Integer index) {
        if(index >= 0 && index < models.size()) {
            models.remove(models.get(index));
        }
    }

    public void addFlash() {
        flashes.add(new Flash());
    }

    public void removeFlash(Integer index) {
        if(index >= 0 && index < flashes.size()) {
            flashes.remove(flashes.get(index));
        }
    }

    public void editFlash(Integer index, Point3D location, Angle3D angle, Color color, Float power) {
        if(index >= 0 && index < flashes.size()) {
            if (location != null) {
                flashes.get(index).move(location);
            } 
            if (angle != null) {
                flashes.get(index).rotate(angle);
            } 
            if (color != null) {
                flashes.get(index).setColor(color);
            } 
            if (angle != null) {
                flashes.get(index).setPower(power);
            } 
        } else {
            throw new RuntimeException("Error: there is no flash at index " + index);
        }
    }

    public void addCamera() {
        cameras.add(new Camera());
    }

    public void removeCamera(Integer index) {
        if(index >= 0 && index < cameras.size()) {
            cameras.remove(cameras.get(index));
        }
    }

    public void editCamera(Integer index, Point3D location, Angle3D angle) {
        if(index >= 0 && index < cameras.size()) {
            if (location != null) {
                cameras.get(index).move(location);
            } 
            if (angle != null) {
                cameras.get(index).rotate(angle);
            } 
        } else {
            throw new RuntimeException("Error: there is no camera at index " + index);
        }
    }

    public List<PolygonalModel> getModels() {
        return this.models;
    }

    public List<Flash> getFlashes() {
        return this.flashes;
    }

    public List<Camera> getCameras() {
        return this.cameras;
    }
    
}
