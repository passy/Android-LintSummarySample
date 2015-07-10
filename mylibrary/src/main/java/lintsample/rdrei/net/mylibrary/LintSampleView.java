package lintsample.rdrei.net.mylibrary;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;

public class LintSampleView extends View {
    public LintSampleView(Context context) {
        super(context);
    }

    public LintSampleView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        final Object unnecessaryAllocation = new Object();
    }
}
