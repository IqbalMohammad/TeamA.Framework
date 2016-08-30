package dataRead;

import common.Base;

/**
 * Created by iqbal on 8/29/2016.
 */
public class Read extends Base{

    public void ClickOnSearch() {
        clickByCss(".header-GlobalSearch-submit.btn");
    }
    public void TypeOnSearch(){
        typeByCss("#global-search-input", "All Departments");
    }
}

