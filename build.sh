#jar cfm main.jar MANIFEST.mf -C out/production/openeditor .

build_dir="out/production/openeditor"
main_class="com.pieulr.openeditor.Main"
project_name="openeditor"
jar cfe ${project_name}.jar ${main_class} -C ${build_dir} .
