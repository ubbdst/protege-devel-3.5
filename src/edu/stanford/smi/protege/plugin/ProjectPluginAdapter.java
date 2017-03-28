package edu.stanford.smi.protege.plugin;

import edu.stanford.smi.protege.model.*;
import edu.stanford.smi.protege.ui.*;

/**
 * 
 * @author Ray Fergerson <fergerson@smi.stanford.edu>
 */
public class ProjectPluginAdapter extends AbstractProjectPlugin {

    public void afterCreate(Project p) {
    }

    public void afterLoad(Project p) {
    }
    
    public void afterSave(Project p) {
        System.out.println("Triggering after save for " + p.getProjectName());
    }


    public void afterShow(ProjectView view, ProjectToolBar toolBar, ProjectMenuBar menuBar) {
    }

    public void beforeSave(Project p) {
        System.out.println("Triggering before save for instance" + p.getProjectInstance().getName());
    }

    public void beforeHide(ProjectView view, ProjectToolBar toolBar, ProjectMenuBar menuBar) {
    }

    public void beforeClose(Project p) {
    }

}
