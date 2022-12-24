<template>
  <div style="margin-left: 30px; margin-right: 15px">
    <div style="display: flex; flex-direction: row; margin-top: 5px">
      <div style="font-size: 23px; font-weight:bolder; font-family: 'BM Dohyeon'; color: midnightblue; margin-top: 5px; margin-right: 6px">
        <icon-common/>
      </div>
    <div>
      <div style="font-size: 27px; font-weight:bolder; font-family: 'BM Dohyeon'; color: midnightblue">
        {{ this.getRepoName }}
      </div>
      <div style="color: dimgrey; font-size: 12px; margin-bottom: 35px; margin-top: 10px;">
        {{ this.getRepoDescription }}
      </div>
    </div>
    </div>
    <!--    <a-divider style="margin-top: 9px; margin-bottom: 9px;"></a-divider>-->
    <div style="font-size: 23px; font-family: Arial; font-weight:bolder; color: midnightblue">About Developers</div>
    <a-divider style="margin-top: 9px; margin-bottom: 20px"></a-divider>

    <a-list style="margin-right: 5px">
      <a-list-item>
        <div style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew'">
          <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>
          There are
          <div class="highlight_text">{{ this.getDevelopers }}
            developers
          </div>
          committed to this repository.
        </div>
      </a-list-item>
      <a-list-item>
        <div
            style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew';">
          <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>
          <div class="highlight_text">Top 10</div>
          of the
          <div class="highlight_text">Most Active</div>
          Developers
        </div>
        <DeveloperCommitChart style="width: 100%; height: 300px; margin-top: 10px"></DeveloperCommitChart>
      </a-list-item>
    </a-list>


    <div style="font-size: 23px; font-family: Arial; font-weight:bolder; color: midnightblue; margin-top: 55px">About
      Issues
    </div>
    <a-divider style="margin-top: 9px; margin-bottom: 20px"></a-divider>

    <a-list style="margin-right: 5px">
      <a-list-item>
        <div style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew'">
          <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>
          There are
          <div class="highlight_text">{{ this.getOpenIssues }}
            issues
          </div>
          are open.
        </div>
        <div style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew'">
          <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>
          There are
          <div class="highlight_text">{{ this.getCloseIssues }}
            issues
          </div>
          are closed.
        </div>
        <open-close-pie-chart style="width: 100%; height: 300px; margin-top: 10px"></open-close-pie-chart>
      </a-list-item>
      <a-list-item>

        <div style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew';">
          <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>
          Typical Issue Resolution Time is
          <div class="highlight_text"> {{ this.getIssueAvg }}h (Average)</div>
          .
          <!--          <div style="color: dimgrey"> (Average)</div>-->
        </div>

        <div style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew'; margin-top: 5px">
          <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>
          Issue Resolution Time's Box Plot:
        </div>
        <issue-duration-chart style="width: 95%; height: 150px; margin-top: 10px"></issue-duration-chart>

        <div style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew'">
          <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>
          <div class="highlight_text">Top 10</div>
          of the
          <div class="highlight_text">Longest</div>
          Resolution Time:
        </div>

        <a-table :columns="columns" :data="content.content" style="width: 450px; margin-left: 230px; margin-top: 10px"
                 :pagination=pagination stripe/>

        <div style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew';">
          <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>
          Issue Resolution Time's Distribution:
        </div>
        <issue-scatter-chart style="width: 100%; height: 350px;"></issue-scatter-chart>
        <div
            style="display: flex; flex-direction: row; font-size: 16px; margin-left: 29px; font-family: 'Arial Hebrew'">
          The
          <div class="highlight_text">variance</div>
          of the above is
          <div class="highlight_text">{{ this.getIssueVariance }}</div>
          .
        </div>
      </a-list-item>
      <a-list-item>
        <div
            style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew';">
          <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>
          Key Words in Issue Text:
        </div>
        <a-list style="margin-top: 15px; margin-left: 70px; margin-right: 70px">
          <a-list-item>
            <a-menu v-model="value"
                    mode="horizontal"
                    :default-selected-keys="['1']"
                    :selected-keys="value"
                    @menu-item-click="onChange"
                    style="height: 40px; margin-top: 2px"
            >
              <a-menu-item key="1">Noun</a-menu-item>
              <a-menu-item key="2">Verb</a-menu-item>
            </a-menu>
            <div v-if="this.value[0]==='1'">
              <div
                  style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew'; margin-top: 25px; margin-left: 60px">
                <!--                <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>-->
                <div class="highlight_text">Top 10</div>
                keywords of
                <div class="highlight_text">Nouns</div>
                :
              </div>
              <word-cloud-graph-noun
                  style="width: 20%; height: 200px; margin-bottom: 20px"></word-cloud-graph-noun>
            </div>
            <div v-if="this.value[0]==='2'">
              <div
                  style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew'; margin-top: 25px; margin-left: 60px">
                <!--                <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>-->
                <div class="highlight_text">Top 10</div>
                keywords of
                <div class="highlight_text">Verbs</div>
                :
              </div>
              <word-cloud-graph-verb
                  style="width: 20%; height: 200px; margin-top: 10px; margin-bottom: 20px"></word-cloud-graph-verb>
            </div>
          </a-list-item>
        </a-list>
      </a-list-item>
    </a-list>


    <div style="font-size: 23px; font-family: Arial; font-weight:bolder; color: midnightblue; margin-top: 55px">About
      Releases & Commits
    </div>
    <a-divider style="margin-top: 9px; margin-bottom: 20px"></a-divider>

    <a-list style="margin-right: 5px">
      <a-list-item>
        <div style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew'">
          <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>
          There are
          <div class="highlight_text">{{ this.getReleases }}
            releases
          </div>
          are in this repository.
        </div>
      </a-list-item>
      <a-list-item>
        <div
            style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew';">
          <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>
          Commits and Releases
        </div>
        <commit-in-release-chart style="width: 100%; height: 350px; margin-top: 10px"></commit-in-release-chart>
      </a-list-item>
      <a-list-item>
        <div
            style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew';">
          <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>
          Developers' Commit Time
        </div>
        <commit-time-chart style="width: 100%; height: 500px; margin-top: 10px"></commit-time-chart>
      </a-list-item>
    </a-list>


  </div>
</template>

<script>
import DeveloperCommitChart from "@/components/DeveloperCommitChart";
import IssueDurationChart from "@/components/IssueDurationChart";
import CommitInReleaseChart from "@/components/CommitInReleaseChart";
import CommitTimeChart from "@/components/CommitTimeChart";
import wordCloudGraphNoun from "@/components/WordCloudGraphNoun";
import IssueScatterChart from "@/components/IssueScatterChart";
import OpenClosePieChart from "@/components/OpenClosePieChart";
import {mapGetters} from "vuex";
import WordCloudGraphVerb from "@/components/WordCloudGraphVerb";

export default {
  name: "GraphPart",
  components: {
    WordCloudGraphVerb,
    DeveloperCommitChart,
    IssueDurationChart,
    CommitInReleaseChart,
    CommitTimeChart,
    wordCloudGraphNoun,
    IssueScatterChart,
    OpenClosePieChart
  },
  computed: {
    ...mapGetters(['getRepo1Name', 'getRepo2Name', "getDevelopers", "getOpenIssues",
      "getCloseIssues", "getIssueAvg", "getReleases", "getIssueVariance", "getIssueTop10Name",
      "getIssueTop10Duration", "getRepoName", "getRepoDescription"]),
    content() {
      return {
        content: [
          {
            key: '1',
            issue: this.getIssueTop10Name[0],
            duration: this.getIssueTop10Duration[0]
          }, {
            key: '2',
            issue: this.getIssueTop10Name[1],
            duration: this.getIssueTop10Duration[1]
          }, {
            key: '3',
            issue: this.getIssueTop10Name[2],
            duration: this.getIssueTop10Duration[2]
          }, {
            key: '4',
            issue: this.getIssueTop10Name[3],
            duration: this.getIssueTop10Duration[3]
          }, {
            key: '5',
            issue: this.getIssueTop10Name[4],
            duration: this.getIssueTop10Duration[4]
          }, {
            key: '6',
            issue: this.getIssueTop10Name[5],
            duration: this.getIssueTop10Duration[5]
          }, {
            key: '7',
            issue: this.getIssueTop10Name[6],
            duration: this.getIssueTop10Duration[6]
          }, {
            key: '8',
            issue: this.getIssueTop10Name[7],
            duration: this.getIssueTop10Duration[7]
          }, {
            key: '9',
            issue: this.getIssueTop10Name[8],
            duration: this.getIssueTop10Duration[8]
          }, {
            key: '10',
            issue: this.getIssueTop10Name[9],
            duration: this.getIssueTop10Duration[9]
          }
        ]
      }
    }
  },
  methods: {
    onChange(val) {
      this.value = [val]

      console.log(val);
    }
  },
  data() {
    return {
      pagination: {pageSize: 5},
      value: ['1'],
      columns: [
        {
          title: 'Rank',
          dataIndex: 'key',
        },
        {
          title: 'Issue',
          dataIndex: 'issue',
        },
        {
          title: 'Duration',
          dataIndex: 'duration',
        }
      ]
    }
  }
}
</script>

<style scoped>
.highlight_text {
  margin-left: 5px;
  margin-right: 5px;
  color: darkblue;
  font-weight: bolder;
}
</style>