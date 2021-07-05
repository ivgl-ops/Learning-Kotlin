package ivangladko.getfilms.questgo.data.remote.quest

import com.google.gson.annotations.SerializedName

data class QuestListResponse (val items: List<QuestListItem>)

data class QuestListItem(
    val questId: String,
    // замена полей в коде
    @SerializedName("questName")
    val name: String

)