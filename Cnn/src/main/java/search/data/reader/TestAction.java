package search.data.reader;

import common.Base;

/**
 * Created by iqbal on 8/29/2016.
 */

public class TestAction extends Base{

    public void ClickOnSearch() {
        clickByCss("#search-button");
    }
    public void TypeOnSearch(){
        typeByCss("#search-input-field", "tech");
    }
}
