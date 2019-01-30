Javaのマルチプロジェクトの構成をGradleで作成しました
====

Overview

core - mainクラスを持つ。domain, common, java-utilを呼び出す
domain - common, java-utilを呼び出す
common
java-util - このプロジェクト階層から外れたところに存在するプロジェクトからもインポートできるかを確認するためのもの


rootパスでgradle buildを二回やらないとdomainの変更が反映されない謎があります