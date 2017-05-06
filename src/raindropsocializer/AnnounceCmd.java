package raindropsocializer;

import java.util.Arrays;
import java.util.List;
 
import PluginReference.ChatColor;
import PluginReference.MC_Command;
import PluginReference.MC_Player;
import PluginReference.RainbowUtils;
 
public class AnnounceCmd implements MC_Command {
 
    @Override
    public List<String> getAliases() {
    	return Arrays.asList("news", "bc");
    }
 
    @Override
    public String getCommandName() {
        return "broadcast";
    }
 
    @Override
    public String getHelpLine(MC_Player arg0) {
        return ChatColor.LIGHT_PURPLE + "/broadcast " + ChatColor.WHITE + "--- Broadcast Message";
    }
 
    @Override
    public List<String> getTabCompletionList(MC_Player arg0, String[] arg1) {
        return null;
    }
 
    @Override
    public void handleCommand(MC_Player plr, String[] args) {
        if(hasPermissionToUse(plr) == true) {
            RainbowUtils.getServer().broadcastMessage(ChatColor.YELLOW + "[SERVER NEWS] " + ChatColor.AQUA + args);
        } else {
            plr.sendMessage(ChatColor.RED + "No Permission.");
        }
       
    }
 
    @Override
    public boolean hasPermissionToUse(MC_Player plr) {
        return plr.hasPermission("raindrop.broadcast.use");
    }
 
}