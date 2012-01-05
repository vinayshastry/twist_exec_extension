package com.thoughtworks.twist.ant;

import java.io.File;

public interface FileSetFilter {

	File[] filterFileset(File[] toExecute);

}
