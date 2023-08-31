package Homework1.InMemoryModel;

import Homework1.ModelElements.Camera;
import Homework1.ModelElements.Flash;
import Homework1.ModelElements.Poligon;
import Homework1.ModelElements.PoligonalModel;
import Homework1.ModelElements.Scene;

public class ModelStore implements IModelChanger {
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    private IModelChangedObserver changedObservers;
    
    public ModelStore(IModelChangedObserver changedObservers) {
        this.changedObservers = changedObservers;
        this.models = new PoligonalModel(new Poligon());
        this.flashes = new Flash();
        this.cameras = new Camera();
        this.scenes = new Scene(this.models, this.flashes, this.cameras);
    }
    
    public Scene getScena(int n) {
        return this.scenes;
    }
    
    @Override
    public void notifyChange(IModelChanger sender) {
    }
}

