# GlobalPay Hub

> Cross-border payment access and capability management platform MVP  
> 跨境支付接入与支付能力管理平台 MVP

GlobalPay Hub is a product-oriented backend project for cross-border merchant payment access, payment capability management, and transaction orchestration.  
GlobalPay Hub 是一个面向跨境商户支付接入、支付能力管理与交易编排的产品型后端项目。

It provides merchant access, application management, payment method management, collection tools, payment sandbox flow, callback handling, refund processing, and basic operations management.  
它提供商户接入、应用管理、支付方式管理、收款工具、支付调试、回调处理、退款流转与基础运营管理能力。

---

## Product Positioning | 产品定位

GlobalPay Hub is designed as a lightweight payment access platform that helps merchants manage payment capabilities through one unified backend.

It is positioned as:

- a cross-border payment access and capability management MVP
- a merchant-facing payment control console
- a backend architecture practice project with real product semantics
- a product prototype that can evolve into a payment platform foundation

GlobalPay Hub 被设计为一个轻量级支付接入平台，帮助商户通过统一后台管理支付能力。

它的定位是：

- 跨境支付接入与支付能力管理 MVP
- 面向商户的支付控制台
- 带真实产品语义的后端架构练手项目
- 可继续演进为支付平台基础能力的产品原型

---

## What Problem It Solves | 解决什么问题

Cross-border merchants often face these issues:

- payment channels are fragmented
- application credentials and callback settings are hard to manage
- payment methods are not presented through one unified capability layer
- sandbox testing and live processing are mixed together
- payment and refund callbacks are hard to trace

GlobalPay Hub aims to solve these with one unified access and orchestration layer.

跨境商户通常会遇到这些问题：

- 支付渠道分散
- 应用密钥和回调配置不好管理
- 支付方式没有统一的能力层
- 沙箱调试和正式交易混在一起
- 支付与退款回调难以追踪

GlobalPay Hub 的目标，就是用一层统一的接入与编排能力把这些问题收口。

---

## Core Capabilities | 核心能力

- Merchant login and basic authentication
- Application management
- Payment method management
- Collection toolkit: API Integration, Hosted Checkout, Payment Link
- Payment sandbox / debug flow
- Unified payment order creation and query
- Payment callback verification and idempotent processing
- Refund request and refund callback handling
- Basic admin console for payment, refund, and routing management

- 商户登录与基础鉴权
- 应用管理
- 支付方式管理
- 收款工具：API 接入、托管收银台、Payment Link
- 支付调试与沙箱流程
- 统一支付单创建与查询
- 支付回调验签与幂等处理
- 退款申请与退款回调处理
- 支付单、退款单、路由规则的基础后台管理

---

## MVP Scope | 第一阶段范围

The first stage focuses on the access console and core transaction flow:

1. Merchant login
2. Application management
3. Payment method management
4. Collection toolkit
5. Payment sandbox / debug page
6. Payment order query
7. Refund request
8. Refund callback handling
9. Basic admin pages

第一阶段聚焦接入控制台与核心交易链路：

1. 商户登录
2. 应用管理
3. 支付方式管理
4. 收款工具
5. 支付调试台
6. 支付单查询
7. 发起退款
8. 退款回调处理
9. 基础后台页面

---

## Product Pages | 产品页面

The current prototype includes:

- Merchant login page
- Merchant dashboard
- Application management page
- Payment method management page
- Collection toolkit page
- Payment sandbox / debug page
- Payment list page
- Payment detail page
- Refund request page
- Refund list page
- Admin payment management page
- Admin refund management page
- Admin routing management page

当前原型包含以下页面：

- 商户登录页
- 商户控制台
- 应用管理页
- 支付方式管理页
- 收款工具页
- 支付调试台
- 支付单列表页
- 支付详情页
- 退款申请页
- 退款列表页
- 后台支付单管理页
- 后台退款单管理页
- 后台渠道路由管理页

Prototype and product docs | 原型与产品文档：

- [globalpay-hub-doc](https://github.com/fengjing-dev/globalpay-hub-doc)

---

## Architecture Highlights | 架构亮点

- Channel integration is decoupled through strategy and factory patterns
- Application access mode is modeled as a first-class domain
- Payment and refund states are controlled by explicit transitions
- Callback processing is designed with idempotency in mind
- Routing rules are configuration-driven instead of hard-coded
- Monetary values are handled with `BigDecimal`

- 支付渠道接入通过策略模式和工厂模式解耦
- 接入模式作为一级领域单独建模
- 支付与退款状态通过显式流转控制
- 回调处理从一开始就按幂等思路设计
- 路由规则配置化，而不是硬编码
- 金额字段统一使用 `BigDecimal`

---

## Tech Stack | 技术栈

- Java 17
- Spring Boot 3.x
- MySQL 8
- Redis
- MyBatis / MyBatis Plus
- Swagger / OpenAPI

---

## Module Overview | 模块划分

```text
com.globalpay.hub
├─ auth
├─ merchant
├─ application
├─ payment
├─ refund
├─ channel
├─ routing
├─ audit
└─ common
```

Recommended layered structure | 推荐分层结构：

```text
controller -> service -> manager -> mapper
```

---

## Documentation | 文档仓库

Design docs, prototypes, and planning are maintained here:

设计文档、页面原型与开发规划维护在这里：

- [globalpay-hub-doc](https://github.com/fengjing-dev/globalpay-hub-doc)

---

## Development Strategy | 开发策略

Recommended implementation order:

1. Build backend project skeleton
2. Freeze first-stage page scope
3. Implement merchant frontend and admin frontend as separate projects
4. Implement application management and payment method views
5. Implement collection toolkit and sandbox flow
6. Implement payment and refund main flows
7. Verify the workflow with Swagger / Postman

推荐开发顺序：

1. 搭建后端项目骨架
2. 冻结第一阶段页面范围
3. 分别搭建商户端和管理后台前端工程
4. 实现应用管理和支付方式管理
5. 实现收款工具与支付调试台
6. 实现支付与退款主链路
7. 使用 Swagger / Postman 验证主流程

---

## First-Stage Completion Criteria | 第一阶段完成标准

The MVP can be considered complete when:

- merchants can log in
- application management is available
- payment methods can be viewed
- collection tools are available
- the sandbox payment flow works
- payment orders can be queried
- refund flow is available
- admin pages support basic troubleshooting

当满足下面条件时，第一阶段 MVP 可视为完成：

- 商户可以登录
- 可以管理应用
- 可以查看支付方式能力
- 可以使用收款工具
- 支付调试台可用
- 支付单可查询
- 退款主链路可用
- 后台页面可支持基础排障

---

## Future Evolution | 后续演进

- real channel integration such as Stripe or PayPal
- hosted checkout customization
- merchant onboarding workflow
- exchange rate management
- reconciliation and compensation tasks
- merchant notification retry

- 接入真实渠道，例如 Stripe / PayPal
- 托管收银台定制
- 商户进件流程
- 汇率管理
- 对账与补偿任务
- 商户通知重试
