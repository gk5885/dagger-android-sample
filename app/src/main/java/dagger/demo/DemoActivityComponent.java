package dagger.demo;

import dagger.Component;

/**
 * Created by gak on 9/25/14.
 */
@Component(
        dependencies = DemoApplicationComponent.class,
        modules = ActivityModule.class
)
interface DemoActivityComponent extends DemoFragment.Injector {
    DemoActivity injectActivity(DemoActivity activity);
}
