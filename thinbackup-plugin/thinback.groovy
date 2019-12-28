import org.jvnet.hudson.plugins.thinbackup.ThinBackupMgmtLink;

import org.jvnet.hudson.plugins.thinbackup.ThinBackupPluginImpl;

String backupPath = "var/lib/username";
String fullBackupSchedule = "0 13 * * 1-5";
String diffBackupSchedule = "1 14 * * 1-5";
boolean backupBuildResults= true



ThinBackupPluginImpl thinBack = new ThinBackupPluginImpl();
thinBack.setBackupPath(backupPath) 
thinBack.setFullBackupSchedule(fullBackupSchedule)
thinBack.setDiffBackupSchedule(diffBackupSchedule)
thinBack.setBackupBuildResults(backupBuildResults)
