package dagger.demo;

import android.app.Application;

/**
 * Created by gak on 9/25/14.
 */
public class DemoApplication extends Application {
    private DemoApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        this.component = Dagger_DemoApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        component.injectApplication(this);
    }

    DemoApplicationComponent getComponent() {
        return component;
    }
}
