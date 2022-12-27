<template>
  <div class="page">
    <div style="display: flex; justify-content: center; width: 1200px; margin-top: 20px">
      <a-menu
          v-model="value"
          :style="{ paddingTop:'10px', width: '260px', height: '100%',boxShadow: '0 0 1px rgba(0, 0, 0, 0.3)', borderRadius:'10px'}"
          :selected-keys="value"
          show-collapse-button
          breakpoint="xl"
          @menu-item-click="onChange"
          @collapse="onCollapse"
          mode="pop"
      >
<!--        <a-menu-item v-for="item in repo_list" :key="repo_list.indexOf(item)">-->
<!--          <template #icon>-->
<!--            <icon-common/>-->
<!--          </template>-->
<!--          {{ item.name }}-->
<!--        </a-menu-item>-->
        <a-menu-item key='0' >
          <template #icon>
            <icon-common/>
          </template>
          {{this.getRepo1Name}}
        </a-menu-item>

        <a-menu-item key='1'>
          <template #icon>
            <icon-common/>
          </template>
          {{this.getRepo2Name}}
        </a-menu-item>

      </a-menu>
      <graph-part style="width: 100%;"></graph-part>
    </div>
  </div>
</template>

<script>
import GraphPart from "@/components/MainPart";
import {mapGetters, mapActions} from "vuex";

export default {
  name: "MenuPart",
  components: {GraphPart},
  computed:{
    ...mapGetters(['getRepo1Name', 'getRepo2Name', "getRepo1Id", "getRepo2Id"]),
    // rep1_name(){
    //   return this.getRepo2Name
    // }
  },
  data() {
    return {
      value: ['0']
    }
  },
  mounted() {
    // this.developer(19257422)
    this.repoInit()
    this.initRepo(4710920)

  },
  methods: {
    ...mapActions(["repoInit",  "repoNameDes", "developer", "open_issue", "closed_issue", "releases", "topCommitter", "issueResolution", "issueKeywords",
    "issueScatter", "issueTop10", "commitTime", "releaseCommit", "releasePredict"]),
    initRepo(id){
      this.developer(id)
      this.repoNameDes(id)
      this.closed_issue(id)
      this.open_issue(id)
      this.releases(id)
      this.topCommitter(id)
      this.issueResolution(id)
      this.issueKeywords(id)
      this.issueScatter(id)
      this.issueTop10(id)
      this.commitTime(id)
      this.releaseCommit(id)
      this.releasePredict(id)
    },
    onEnter() {
      console.log('trigger enter');
    },
    onChange(val) {
      if(val==='0'){
        this.initRepo(this.getRepo1Id)
      }else {
        this.initRepo(this.getRepo2Id)
      }
      this.value = [val]

      console.log(val);
    },
  },
}
</script>

<style scoped>
.page {
  display: flex;
  /*flex-direction: row;*/
  height: 100%;
  justify-content: center;
  /*align-content: space-around;*/
  margin-left: 20px;
  margin-right: 20px;
  margin-top: 23px;

}
</style>