package dagger.demo;

import dagger.Component;

/**
 * Created by gak on 9/25/14.
 */
@Component(
        modules = ApplicationModule.class
)
interface DemoApplicationComponent {
    DemoApplication injectApplication(DemoApplication application);
}
