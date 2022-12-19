<template>
  <div style="margin-left: 30px; margin-right: 15px">


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
          of the Most Active Developers
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
          <div class="highlight_text">{{this.getOpenIssues}}
            issues
          </div>
          are open.
        </div>
        <div style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew'">
          <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>
          There are
          <div class="highlight_text">{{this.getCloseIssues}}
            issues
          </div>
          are closed.
        </div>
      </a-list-item>
      <a-list-item>

        <div style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew';">
          <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>
          Typical Issue Resolution Time is
          <div class="highlight_text"> {{this.getIssueAvg}}h</div>
          <div style="color: dimgrey"> (Average)</div>
        </div>

        <div style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew'; margin-top: 5px">
          <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>
          Issue Resolution Time's Box Plot:
        </div>
        <issue-duration-chart style="width: 95%; height: 150px; margin-top: 10px"></issue-duration-chart>

        <div style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew'">
          <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>
          <div class="highlight_text">Top 10</div>
          of the Longest Resolution Time:
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
          The Variance of the above is
          <div class="highlight_text">{{this.getIssueVariance}}</div>
        </div>
      </a-list-item>
      <a-list-item>
        <div
            style="display: flex; flex-direction: row; font-size: 16px; font-family: 'Arial Hebrew';">
          <icon-send style="color: darkblue; margin-right: 8px;"></icon-send>
          Key Words in Issue Text:
        </div>
        <word-cloud-graph style="width: 20%; height: 200px; margin-top: 10px; margin-bottom: 20px"></word-cloud-graph>
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
          <div class="highlight_text">{{this.getReleases}}
            releases
          </div>
          are in this repo
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
import wordCloudGraph from "@/components/WordCloudGraph";
import IssueScatterChart from "@/components/IssueScatterChart";
import {mapGetters} from "vuex";

export default {
  name: "GraphPart",
  components: {
    DeveloperCommitChart,
    IssueDurationChart,
    CommitInReleaseChart,
    CommitTimeChart,
    wordCloudGraph,
    IssueScatterChart
  },
  computed: {
    ...mapGetters(['getRepo1Name', 'getRepo2Name', "getDevelopers", "getOpenIssues",
      "getCloseIssues", "getIssueAvg", "getReleases", "getIssueVariance", "getIssueTop10Name",
    "getIssueTop10Duration"]),
    content(){
      return{
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
            duration:this.getIssueTop10Duration[3]
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
  // methods: {
  //   initRepo1() {
  //
  //   },
  //   initRepo2() {
  //
  //   },
  // },
  data() {
    return {
      pagination: {pageSize: 5},
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